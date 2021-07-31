package com.example.samplejetpackcomposeapp.ui.providers

import com.example.samplejetpackcomposeapp.R
import com.example.samplejetpackcomposeapp.data.models.FeedModel

object DataProvider {
    val feedList = listOf(
        FeedModel(
            id = 1,
            username = "Saturnday",
            handle = "@saturdayjordan",
            description = "Everyday is the weekend on Saturnday.",
            profilePictureUrl = R.drawable.saturnday,
            tweet = "More rings than Jordan so everyday is the weekend on Saturnday. Striving for greatness isn't always going to be hard in fact it's going to be really enjoyable. If you're not in love with what you do with the majority of your time are you truly living?"
        ),
        FeedModel(
            id = 2,
            username = "Eco",
            handle = "@echoeco",
            description = "Hollow and cold, Eco is play on worlds I mean words representing the earth-like planet inside of a hollow cup where sound is bound to echo.",
            profilePictureUrl = R.drawable.eco,
            tweet = "Hollow and cold, an earth-like planet inside of a hollow glass, Eco is an echo chamber of jumbled thoughts and patterns colliding with one another "
        ),
        FeedModel(
            id = 3,
            username = "Cosmic Brownie",
            handle = "@thecosmosandwonders",
            description = "Counterintuitive like its name, Cosmic Brownie represents how complex the simple things in life can be. ",
            profilePictureUrl = R.drawable.cosmicbrownie,
            tweet = "The universe is full of wonders. We cannot even imaging anything beyond what we can perceive with our five senses and the tools we create. There is a literal universe of possibility. Anything truly is possible."

        ),
        FeedModel(
            id = 4,
            username = "Eyes Wide",
            handle = "@eyedoctor",
            description = "She’s the only one I can see together or apart. I didn’t know love could be so filling. What takes me paragraphs and hours to explain to others, she understands in seconds. She showed me a different way look at our world. This collection is inspired by the love she gave to me. I see you, Tay.",
            profilePictureUrl = R.drawable.eyeswide,
            tweet = "I can see everything from here. Like the life can be so beautifully ugly."

        ),
        FeedModel(
            id = 5,
            username = "Controller",
            handle = "@psIV",
            description = "Don’t allow what happened to Control what happens.",
            profilePictureUrl = R.drawable.controller,
            tweet = "Let the past be the past"

        ),
        FeedModel(
            id = 6,
            username = "House of El",
            handle = "@kalel",
            description = "The sky is not the limit. Your mind is. \n" +
                    "\n" +
                    "There are diamonds beyond your sky",
            profilePictureUrl = R.drawable.houseofel,
            tweet = "Open up your mind ...\n" +
                    "There are diamonds beyond your sky"

        ),
        FeedModel(
            id = 7,
            username = "Brain Storm",
            handle = "@bGenius",
            description = "Humanity will go as far as our collective imaginations",
            profilePictureUrl = R.drawable.brainstorm,
            tweet = "Humanity will go as far as our collective imaginations. We fail where division starts."

        ),
        FeedModel(
            id = 8,
            username = "Pluto X Baby Pluto",
            handle = "@future",
            description = "“Stick with King Pluto and get what you dreamin”",
            profilePictureUrl = R.drawable.pluto,
            tweet = "Together, we're better."

        ),
        FeedModel(
            id = 9,
            username = "Control",
            handle = "@teezytay",
            description = "Surrender is the only way to stay in control so I surrendered to her love. I’ve never felt more in control. ",
            profilePictureUrl = R.drawable.control,
            tweet = "It's all about balance"

        )

    )
}