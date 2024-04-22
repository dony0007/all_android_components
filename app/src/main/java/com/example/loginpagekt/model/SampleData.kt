import com.example.loginpagekt.R
import com.example.loginpagekt.model.ItemsViewModel


/**
 * SampleData for Jetpack Compose Tutorial
 */
object SampleData {
    // Sample conversation data
    val conversationSample = listOf(
        ItemsViewModel(
            R.drawable.dhoni,
            "MS Dhoni",
            "Test...Test...Test..."
        ),
        ItemsViewModel(
            R.drawable.smriti,
            "Smrithi Mandhana",
            """List of Android versions:
            |Android KitKat (API 19)
            |Android Lollipop (API 21)
            |Android Marshmallow (API 23)
            |Android Nougat (API 24)
            |Android Oreo (API 26)
            |Android Pie (API 28)
            |Android 10 (API 29)
            |Android 11 (API 30)
            |Android 12 (API 31)""".trim()
        ),
        ItemsViewModel(
            R.drawable.kohili,
            "Virat Kohli",
            """I think Kotlin is my favorite programming language.
            |It's so much fun!""".trim()
        ),
        ItemsViewModel(
            R.drawable.klrahul,
            "KL Rahul",
            "Searching for alternatives to XML layouts..."
        ),
        ItemsViewModel(
            R.drawable.klrahul,
            "KL Rahul",
            """Hey, take a look at Jetpack Compose, it's great!
            |It's the Android's modern toolkit for building native UI.
            |It simplifies and accelerates UI development on Android.
            |Less code, powerful tools, and intuitive Kotlin APIs :)""".trim()
        ),
        ItemsViewModel(
            R.drawable.dhoni,
            "MS Dhoni",
            "It's available from API 21+ :)"
        ),
        ItemsViewModel(
            R.drawable.klrahul,
            "KL Rahul",
            "Writing Kotlin for UI seems so natural, Compose where have you been all my life?"
        ),
        ItemsViewModel(
            R.drawable.smriti,
            "Smrithi Mandhana",
            "Android Studio next version's name is Arctic Fox"
        ),
        ItemsViewModel(
            R.drawable.dhoni,
            "MS Dhoni",
            "Android Studio Arctic Fox tooling for Compose is top notch ^_^"
        ),
        ItemsViewModel(
            R.drawable.kohili,
            "Virat Kohli",
            "I didn't know you can now run the emulator directly from Android Studio"
        ),
        ItemsViewModel(
            R.drawable.smriti,
            "Smrithi Mandhana",
            "Compose Previews are great to check quickly how a composable layout looks like"
        ),
        ItemsViewModel(
            R.drawable.klrahul,
            "KL Rahul",
            "Previews are also interactive after enabling the experimental setting"
        ),
        ItemsViewModel(
            R.drawable.dhoni,
            "MS Dhoni",
            "Have you tried writing build.gradle with KTS?"
        ),
    )
}
