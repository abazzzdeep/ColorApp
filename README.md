ColorApp is an Android application developed as an assignment for Janitri Innovations. The app follows the MVVM architecture pattern and leverages Jetpack Compose for the user interface. It allows users to manage a list of colors, with functionalities for local storage, offline access, and data synchronization with a cloud database.

Features
MVVM Architecture: The app follows the Model-View-ViewModel (MVVM) pattern for a clean separation of concerns and maintainable code.

Screenshot:
![Screenshot 2024-09-01 215515](https://github.com/user-attachments/assets/4fa8eb43-581e-4557-bc75-7275449d4719)


Offline Storage: Colors are stored locally using Room Database, ensuring that the color list is accessible even without an internet connection.

Random Color Generation: Users can generate and add random colors with parameters such as color code and timestamp.

Cloud Synchronization: Data can be synced with a cloud database, with pending entries displayed and updated.

Jetpack Compose: The app uses Jetpack Compose for building the user interface, providing a modern and declarative way to design UIs.


Tasks Completed
MVVM Architecture: Implemented the MVVM pattern to structure the application.
Cloud Database: Integrated a cloud database (Firebase or Google Sheets) to store and retrieve color data.
Local Storage: Utilized Room Database to store color data locally, ensuring offline access.
Add Color Functionality: Implemented a feature to generate a new random color with parameters such as color and time on clicking the "Add Color" button.
Sync Functionality: Added a "Sync" button to upload local data to the cloud database. The sync process updates the number of pending entries.
Pending Entries Counter: Displayed the number of pending entries next to the sync icon, updated every time data is synced.


Getting Started
Prerequisites
Android Studio
Kotlin
Android SDK


Setup
Clone the Repository:
git clone https://github.com/your-username/ColorApp.git

Open the Project:
Open Android Studio.
Choose "Open an existing project" and select the cloned repository folder.

Sync Project:
Click on "Sync Project with Gradle Files" in Android Studio to download dependencies.

Run the App:
Connect an Android device or start an emulator.
Click "Run" in Android Studio to build and deploy the app.


Usage
Add Color: Click the "Add Color" button to generate and add a new random color.
Sync Data: Click the "Sync" button to upload local color entries to the cloud database.
View Colors: The color list is displayed with each color’s code and timestamp.
