package com.example.imageviewer.data

import com.example.imageviewer.R
import com.example.imageviewer.model.ImageItem

class ImageRepository {

    private val images = listOf(
        ImageItem(
            id = 1,
            title = "Faces Places",
            description = "A documentary by Agnès Varda and JR, exploring rural France through art and photography. The film follows the duo as they travel and create large-scale portraits.",
            imageResId = R.drawable.img1,
            category = "Documentary",
            director = "Agnès Varda & JR"
        ),
        ImageItem(
            id = 2,
            title = "Beauty and the Beast",
            description = "A live-action adaptation of Disney's animated classic. A young woman is held prisoner by a beast in his castle, where she discovers the kind heart beneath his monstrous exterior.",
            imageResId = R.drawable.img2,
            category = "Fantasy",
            director = "Bill Condon"
        ),
        ImageItem(
            id = 3,
            title = "Call Me by Your Name",
            description = "Set in 1980s Italy, a coming-of-age story about a summer romance between a young man and an academic visiting his family's villa.",
            imageResId = R.drawable.img3,
            category = "Romance",
            director = "Luca Guadagnino"
        ),
        ImageItem(
            id = 4,
            title = "Guardians of the Galaxy Vol. 2",
            description = "The Guardians continue their adventures through the cosmos as they uncover the mystery of Peter Quill's parentage and face new cosmic threats.",
            imageResId = R.drawable.img4,
            category = "Action",
            director = "James Gunn"
        ),
        ImageItem(
            id = 6,
            title = "Star Wars: The Last Jedi",
            description = "Rey develops her abilities with the guidance of Luke Skywalker, as the Resistance prepares for battle against the First Order.",
            imageResId = R.drawable.img5,
            category = "Sci-Fi",
            director = "Rian Johnson"
        ),
        ImageItem(
            id = 6,
            title = "Star Wars: The Last Jedi",
            description = "Rey develops her abilities with the guidance of Luke Skywalker, as the Resistance prepares for battle against the First Order.",
            imageResId = R.drawable.img6,
            category = "Sci-Fi",
            director = "Rian Johnson"
        ),
        ImageItem(
            id = 7,
            title = "Blade Runner 2049",
            description = "A young blade runner's discovery of a secret leads him on a quest to find a former blade runner who has been missing for thirty years.",
            imageResId = R.drawable.img7,
            category = "Sci-Fi",
            director = "Denis Villeneuve"
        ),
        ImageItem(
            id = 8,
            title = "The Disaster Artist",
            description = "A biographical comedy-drama about the making of the infamous cult film The Room, showcasing the friendship between aspiring actors Tommy Wiseau and Greg Sestero.",
            imageResId = R.drawable.img8,
            category = "Comedy",
            director = "James Franco"
        )
    )

    fun getAllImages(): List<ImageItem> {
        return images
    }

    fun getImageById(id: Int): ImageItem? {
        return images.find { it.id == id }
    }

    fun getImagesByCategory(category: String): List<ImageItem> {
        return images.filter { it.category == category }
    }
}