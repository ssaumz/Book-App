# BookApp: Add and Delete Books using Kotlin

## Project Overview

Welcome to the BookApp! This application allows users to manage a collection of books by adding new books and deleting existing ones. Built using Kotlin, this app showcases basic CRUD operations and aims to provide an intuitive user experience for book management.

## Table of Contents

1. [Project Description](#project-description)
2. [Technologies Used](#technologies-used)
3. [Setup and Installation](#setup-and-installation)
4. [Usage](#usage)
5. [Project Structure](#project-structure)
6. [Contributing](#contributing)
7. [License](#license)
8. [Contact](#contact)

## Project Description

The BookApp is designed to help users manage their personal library. Users can add new books by entering the book's details and delete books they no longer wish to keep in their collection. This project demonstrates the use of Kotlin for Android development, including UI design, data handling, and interaction with a local database.

### Features

- Add a new book with title, author, and genre.
- Delete an existing book from the collection.
- View the list of all added books.

## Technologies Used

- **Kotlin**: Primary programming language used for development.
- **Android SDK**: Tools and libraries required to develop Android applications.
- **Room Database**: For local data storage and management.
- **Android Studio**: Integrated development environment (IDE) used for development.

## Setup and Installation

### Prerequisites

Ensure you have the following installed:

- Android Studio (version 4.1 or higher)
- Android Emulator or a physical Android device for testing

### Installation Steps

1. **Clone the Repository**

   ```bash
   git clone https://github.com/username/BookApp.git
   cd BookApp
   ```

2. **Open in Android Studio**

   - Launch Android Studio.
   - Click on `Open an existing Android Studio project`.
   - Navigate to the `BookApp` directory and select it.
   - Let Android Studio import the project and download any necessary dependencies.

3. **Run the App**

   - Connect your Android device via USB or start an Android Emulator.
   - Click on the `Run` button (green arrow) in Android Studio.
   - Select the deployment target and click `OK`.

## Usage

### Adding a Book

1. Launch the BookApp on your device.
2. Click on the `Add Book` button.
3. Enter the book's title, author, and genre in the provided fields.
4. Click on the `Save` button to add the book to your collection.

### Deleting a Book

1. On the main screen, long press the book you want to delete.
2. Confirm the deletion in the dialog that appears.

### Viewing Books

- All added books are displayed on the main screen of the app.

## Project Structure

```
BookApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/bookapp/
│   │   │   │   ├── data/
│   │   │   │   │   ├── Book.kt
│   │   │   │   │   ├── BookDao.kt
│   │   │   │   │   ├── BookDatabase.kt
│   │   │   │   ├── ui/
│   │   │   │   │   ├── BookAdapter.kt
│   │   │   │   │   ├── MainActivity.kt
│   │   │   │   │   ├── AddBookActivity.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   ├── activity_add_book.xml
│   │   │   │   ├── values/
│   │   │   │   │   ├── strings.xml
│   ├── build.gradle
│   ├── AndroidManifest.xml
├── README.md
```

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Open a Pull Request.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

## Contact

-**Saumya Poojari** - [saumya.poojarii7@gmail.com]

-LinkedIn - https://www.linkedin.com/in/ssaumz/
Feel free to reach out with any questions or feedback!

---

Thank you for your interest in the BookApp project. Happy coding! 🚀
