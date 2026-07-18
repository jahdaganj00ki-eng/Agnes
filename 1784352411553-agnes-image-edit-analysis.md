# Agnes AI Image Editing Application — Screenshot Analysis & Implementation Plan

## 1. UI Structure Analysis

### Global Layout
- **Theme**: Dark mode (black `#000000` / near-black background `#121212`, dark gray cards `#1E1E1E` or similar)
- **Navigation**: Hamburger menu (three horizontal lines) in top-left corner, white, approximately 24px
- **Status Bar**: Android system status bar at top — shows time (15:14), notification icons, signal strength, HD/4G indicators, battery percentage
- **Footer**: Android navigation bar (back, home, recent apps) at bottom

### Primary UI Components

**Header/Nav**
- Top-left: Hamburger menu icon (`≡`), white, no label
- Title: "Agnes" centered or top-aligned in some screens

**Main Content Area**
- Configuration: Empty black canvas in idle state (Screen 1)
- Chat/Response stream: Vertical scrollable card-based message layout

**Input Panel (Fixed Bottom)**
- Rounded pill-shaped container
- Left: `+` icon (white, button) for attachment/upload
- Center: Text input field with placeholder "Type or hold to talk" — placeholder text gray
- Right: Circular send button (blue/purple circle with white up arrow `↑`) in Screen 2, or blue circle with white square icon in Screen 4 (voice mode indicator)
- Above input: White pill-shaped button "Edit Image" with image/paint icon, left-aligned

**Image Reference Card**
- Rounded square thumbnail (blue `#2962FF` or similar vibrant blue)
- Contains large white capital letter "T" centered
- Appears in user message area as uploaded image reference
- Displays persistent identity through workflow

**Skill Loading Cards**
- Each skill load renders as a card with:
  - Book icon (`📖`) left
  - "Load Skill" label
  - Skill path in cyan/teal pill tag: e.g., `aigc-model-guide`, `aigc-model-guide / image-mod...`, `image-generation`, `image-generation / reference-i...`, `image-prompt-craft`
  - "Loaded XXXX Chars" subtext in gray

**Response Cards**
- Dark gray rounded rectangle (`#2A2A2A`)
- White text content
- System status banners: "Thoughts complete (Takes X.XX second...)" with sparkle icon + dropdown chevron

**Prompt Enhancement Module**
- Header: "Prompt Enhancement" with sparkle icon, subtext "Review the enhanced prompt before designing"
- Two sub-sections:
  - "Original prompt" (speech bubble icon) — contains raw user input text
  - "Enhanced prompt" (expand/sparkle icon) — contains AI-expanded detailed description
- Both sections have expand/collapse chevron on right

**Status Indicators**
- Loading spinner: White circle with downward arrow (processing/scroll state)
- Processing banner: "This will take about 30–60 seconds — please wait a moment."
- Action buttons: Thumbs up, Thumbs down, Copy icon, Share icon below output image

### Color Palette
- Background: `#000000` or `#0A0A0A`
- Card/Surface: `#1C1C1E` or `#2C2C2E`
- Text primary: `#FFFFFF`
- Text secondary: `#8E8E93` (placeholder gray)
- Accent/Tag: `#00BCD4` or `#4DD0E1` (cyan for skill tags)
- Button primary: `#FFFFFF` (Edit Image)
- Send button: `#3B82F6` (blue) or purple variant
- Image thumbnail: `#2962FF` (blue square)

## 2. Image Processing Workflow — Complete State Machine

### State Enumeration

**S_IDLE** — Initial empty state (Screen 1)
- No uploaded image
- No conversation history
- Input field active with placeholder
- "Edit Image" button visible but non-functional or triggers upload flow

**S_INPUT_READY** — User has prompt, image may or may not be uploaded (Screen 2)
- User uploaded reference image: Blue square with "T" thumbnail visible in message stream
- User text prompt entered: "Recolor Clothes to red"
- Prompt parser may underline/recognize entities: "red" underlined, indicating color detection
- Send button active (blue circle)
- Input field cleared or preserved for additional context

**S_THINKING_BASIC** — Initial agent acknowledgment (Screen 3, early)
- System loads skill `aigc-model-guide` (8748 chars)
- System loads skill `aigc-model-guide / image-mod...` (10835 chars)
- Agent text response: "I will recolor the clothes in the image to red for you."
- Banner: "Thoughts complete (Takes 1.55 second...)"
- Prompt Enhancement panel visible in side or expandable area (Screen 3 narrow strip, Screen 4 full width)

**S_THINKING_ENHANCED** — Expanded skill orchestration (Screen 4)
- Additional skill loads:
  - `image-generation` (8078 chars)
  - `image-generation / reference-i...` (5429 chars)
  - `image-prompt-craft` (15387 chars)
- Agent response persists
- Loading spinner indicates continuation of thought chain
- Edit Image button and input panel remain available for follow-up edits

**S_PROMPT_ENHANCED** — Prompt engineering phase (Screen 5)
- Explicit "Prompt Enhancement" UI section active
- Original prompt displayed: "Recolor Clothes to red"
- Enhanced prompt generated: Detailed semantic expansion including:
  - Subject inference: "The woman in the pink bikini from img_0001"
  - Action: "is now wearing a vibrant red bikini"
  - Preservation directives: "Keep her face, hairstyle, smiling expression, medium close-up right-facing"
- Status text: "This will take about 30–60 seconds — please wait a moment."
- Time shown: 15:14

**S_GENERATING** — Image synthesis in progress (Screen 6)
- Same status banner: "This will take about 30–60 seconds — please wait a moment."
- Output image placeholder: Large blue square with white "T" (likely result or streaming placeholder)
- Action toolbar below image: Like, Dislike, Copy, Share icons
- Input panel remains at bottom for chained editing

### Workflow Sequence (Linear)

```
1. INIT -> User uploads image reference (blue square "T" thumbnail)
2. INIT -> User types natural language edit prompt
3. SUBMIT -> System enters S_THINKING_BASIC
4. LOAD skill[0]: aigc-model-guide
5. LOAD skill[1]: aigc-model-guide / image-mod...
6. GENERATE -> Agent acknowledgment text
7. LOAD skill[2]: image-generation
8. LOAD skill[3]: image-generation / reference-i...
9. LOAD skill[4]: image-prompt-craft
10. S_THINKING_ENHANCED -> S_PROMPT_ENHANCED
11. EXPAND original prompt into enhanced prompt via image-prompt-craft skill
12. DISPLAY enhanced prompt for user review
13. S_GENERATING -> Begin image generation/editing
14. STATUS update: "30-60 seconds wait"
15. RENDER result image (blue square "T" placeholder/result)
16. ENABLE action toolbar (like, dislike, copy, share)
```

### Interaction Patterns

**Input Modes**
- Text: keyboard entry in input field, send via up arrow button
- Voice: long-press/hold on input area to record, indicated by blue circle with square icon (stop)

**Skill Loading Protocol**
- Sequential non-blocking loads displayed as cards
- Each card shows source file path and character count of loaded knowledge
- Skills are modular, hierarchical, and likely contain prompt engineering rules, safety guidelines, and model-specific syntax
- Character counts suggest context-window aware loading (e.g., 8748, 10835, 8078, 5429, 15387)

**Prompt Enhancement Mechanics**
- Original prompt extracted: "Recolor Clothes to red"
- Enhanced prompt adds:
  - Subject identification (person, clothing type, color)
  - Reference file inference (`img_0001`)
  - Style/pose preservation tokens (face, hairstyle, expression, angular orientation)
- This implies RAG or in-context reasoning from uploaded image analysis

**Image Representation**
- Reference image stored as blue thumbnail with monogram "T"
- Actual image content is visual-only (redacted as blue box per user notes)
- Generated output also represented as blue square "T" in Screen 6, suggesting either streaming placeholder or simplified result preview

### State Persistence
- Prompt enhancement panel maintains scroll position between screens
- "Edit Image" button floats/remains visible across processing states
- Input area never disabled during generation — supports chained requests

## 3. Technical Implementation Specifications

### Architecture Requirements

**Frontend Stack**
- Android native (Kotlin/Java) or Flutter (Dart) based on Android system UI elements
- Jetpack Compose or XML layout with dark theme support
- Material Design 3 components (rounded pills, cards, FAB-like send button)
- Async state management for long-running generation tasks

**Core Modules**
1. `ChatInterface` — Manages message stream (user/agent/system cards)
2. `SkillLoader` — Orchestrates loading of `.skill` or context files, tracks char counts
3. `PromptEnhancer` — Renders original/enhanced prompt expansion UI
4. `ImageEditorView` — Handles reference thumbnail + result rendering
5. `InputBar` — Switches between text and Voice Activity Detection (VAD) modes

**State Machine Implementation**
```python
# Pseudocode for state transitions
states = {
  "IDLE", "INPUT_READY", "THINKING_BASIC", "THINKING_ENHANCED",
  "PROMPT_ENHANCED", "GENERATING", "RESULT_READY", "ERROR"
}
transitions = {
  "SUBMIT": "IDLE -> THINKING_BASIC",
  "SKILL_LOAD_COMPLETE": "THINKING_BASIC -> THINKING_ENHANCED",
  "PROMPT_ENHANCE_COMPLETE": "THINKING_ENHANCED -> PROMPT_ENHANCED",
  "GENERATE_START": "PROMPT_ENHANCED -> GENERATING",
  "RESULT_RECEIVED": "GENERATING -> RESULT_READY"
}
```

**Skill Loading Contract**
```
SkillEntry {
  path: string          // e.g., "aigc-model-guide / image-mod-..."
  char_count: int       // 8748, 10835, etc.
  load_time_ms: float   // 1550ms implied
}
```

**Prompt Enhancement Data Model**
```
EnhancedPrompt {
  original: string      // "Recolor Clothes to red"
  enhanced: string      // Expanded semantic description
  metadata: {
    subject: string     // "The woman in the pink bikini from img_0001"
    action: string      // "is now wearing a vibrant red bikini"
    preservation: string[] // ["face", "hairstyle", "smiling expression", "medium close-up right-facing"]
  }
  estimated_time: string // "30-60 seconds"
}
```

### Critical UX Patterns

1. **Non-blocking skill loads**: Skills load as visible cards, providing transparency to user
2. **Persistent input panel**: Editing capability maintained during long-generation tasks
3. **Prompt review gate**: Explicit "Prompt Enhancement" UI enforces user review before generation
4. **Streaming placeholders**: Large blue "T" square used as both user thumbnail and result placeholder
5. **Time estimation**: "30-60 seconds" expectation management for generative tasks

### Edge Cases & Error Handling
- Skill load failure: Should collapse card or show error state
- Generation timeout: Currently no explicit timeout UI — needs 60s+ handling
- Empty prompt submission: Input validation required before SKILL_LOAD
- Network interruption during generation: Resume or cancel capability not visible in screenshots
- Large skill bundles: Character count display suggests potential truncation concerns

## 4. Open Questions for Implementation

1. **Skill File Format**: Are skills loaded from local assets, remote API, or embedded context? The character counting implies static file loading.
2. **Image Upload Mechanism**: Is the blue "T" thumbnail a true image render or a placeholder? What formats are accepted?
3. **Prompt Enhancement Trigger**: Is this automatic or user-reviewed? Screens suggest automatic with review UI.
4. **Backend Processing**: Is image generation client-side (Android ML Kit) or server-side (API)?
5. **State Synchronization**: If user submits new request during GENERATING, what happens to existing task?

## 5. Implementation Task List

- [ ] Create Authentication/Navigation system for hamburger menu
- [ ] Implement ChatMessageView component (user/agent/system card variants)
- [ ] Build SkillCard component (book icon, path tag, char count)
- [ ] Implement InputBar with text + voice mode toggle
- [ ] Create ImageReference widget (thumbnail + persistent identity)
- [ ] Build PromptEnhancementPanel (original vs expanded view)
- [ ] Implement OrleanStateMachine for the 7 defined states
- [ ] Integrate MessageStreamViewModel with LiveData/StateFlow
- [ ] Add "Edit Image" floating action button logic
- [ ] Implement EstimatedTime banner management
- [ ] Build ResultView with Like/Dislike/Copy/Share actions
- [ ] Create SkillLoader service with file I/O and character counting
- [ ] Implement PromptEnhancer NLP pipeline (likely rules-based or LLM-based expansion)

---
*Generated from 6 screenshot analysis of Agnes AI Chat Windows application*
*File: 1784352411553-agnes-image-edit-analysis.md*
