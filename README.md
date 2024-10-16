

## Project overview

Telegram App source code is a large codebase which has its pros and cons in terms of a single "HUGE" activity with multiple fragments. Still the memory management is top notch. I've attempted to follow its original architecture
and practices except where they tend to get complex with requirements as per https://buidlerstribe.notion.site/Rabble-Android-Assignment-10b18b5a5443807e8239d4d8e015c40f

## Implementation Details

1. Updated Ui to match Figma designs.
2. Added Invite Code Screen as per Telegram Apps's existing Structure.
3. Added Api calls for user login, invite code verification and handled error and edge cases with Dialogs.
4. Web3Auth SDK throws runtime error and could not be  debugged within reasonable time and hence has been emulated to be bypassed with error message displayed.
5. The Flow chart has been reasonably followed for all edge cases

### Setup Instructions

Clone the repo and use the Master branch. Base branch is supposed to be the original branch. 
No special steps except replacing urls to emulate error and success scenarios in the APIConstants.java class

### Video




https://github.com/user-attachments/assets/0f958406-9853-45c7-b4f3-3010771e9d41

