Lexical Twist Puzzle
🧩 Lexical Twist Puzzle
📌 Overview
Lexical Twist Puzzle is a Java-based interactive word puzzle system designed to improve vocabulary, logical reasoning, and pattern recognition skills.
The system challenges users with lexical transformations such as word rearrangement, pattern matching, and letter-based logic puzzles.

The project is structured using a Use Case (UC) driven design approach, where each UC represents a functional module of the system.

🧩 Use Case Details
🟢 UC1: System Initialization
🎯 Object
To initialize and launch the Lexical Twist Puzzle system.

📖 Description
This use case is responsible for starting the application. It sets up the execution environment and displays a welcome message to the user. It ensures that the system is ready before any puzzle interaction begins.

📌 Outcome
The system starts successfully without errors
A welcome message is displayed to the user
The user is informed that the puzzle system is active and ready
🟢 UC2: Puzzle Display and User Interaction
🎯 Object
To present lexical puzzles and enable user interaction.

📖 Description
This use case handles the display of word-based puzzles to the user. It presents scrambled words, letter patterns, or lexical challenges and prompts the user to attempt a solution. This is the main interaction layer between the system and the user.

📌 Outcome
A puzzle is displayed clearly to the user
The user is prompted to enter their answer
The system waits for user interaction before proceeding
🟢 UC3: Input Collection and Validation
🎯 Object
To collect and validate user input for puzzle answers.

📖 Description
This use case captures the user's response to the puzzle and validates it. It ensures that the input is not empty, is properly formatted, and follows expected rules before further processing.

📌 Outcome
Valid input is accepted for processing
Invalid or empty input is rejected
User is prompted again in case of incorrect input
🟢 UC4: Puzzle Processing Logic
🎯 Object
To process the user input based on lexical puzzle rules.

📖 Description
This use case applies the core puzzle logic to the user’s input. It may involve operations such as word rearrangement, letter matching, anagram checking, or pattern transformation to determine correctness.

📌 Outcome
User input is processed using puzzle logic
Internal solution is generated or compared
System prepares evaluation result
🟢 UC5: Result Evaluation
🎯 Object
To evaluate whether the user’s answer is correct or incorrect.

📖 Description
This use case compares the processed user input with the correct solution. It determines whether the user has successfully solved the puzzle and prepares appropriate feedback.

📌 Outcome
Correct or incorrect result is generated
System determines user performance for the attempt
Feedback message is prepared for display
🟢 UC6: Score and Progress Tracking
🎯 Object
To track user performance across multiple puzzles.

📖 Description
This use case maintains the user’s performance metrics such as score, number of correct answers, and attempts. It helps in tracking progress over multiple puzzle rounds.

📌 Outcome
User score is updated after each attempt
Progress across puzzles is recorded
Performance history is maintained during session
🟢 UC7: Feedback System
🎯 Object
To provide meaningful feedback to the user.

📖 Description
This use case delivers feedback based on the result evaluation. It informs the user whether their answer is correct or incorrect and may also provide hints or encouragement for improvement.

📌 Outcome
User receives immediate feedback
Correct answers are acknowledged
Incorrect answers are explained or flagged
🟢 UC8: Program Termination
🎯 Object
To terminate the system safely and gracefully.

📖 Description
This use case ensures that the application ends properly after all puzzles are completed or when the user chooses to exit. It closes resources and provides a closing message.

📌 Outcome
System shuts down safely
Resources are released properly
Exit message is displayed to the user
🏗️ System Flow
UC1 → System Initialization
UC2 → Puzzle Presentation
UC3 → Input Validation
UC4 → Puzzle Processing
UC5 → Result Evaluation
UC6 → Score Tracking
UC7 → Feedback Display
UC8 → System Termination

⚙️ Technologies Used
Java (Console Application)
Object-Oriented Programming (OOP)
String Manipulation Techniques
Control Flow and Logic Building
Modular Design Approach
📈 Future Enhancements
Graphical User Interface (GUI) version
Timed puzzle challenges
Multiple difficulty levels (Easy / Medium / Hard)
Online leaderboard system
Database integration for user history
👩‍💻 Author
Jayanthi M.
