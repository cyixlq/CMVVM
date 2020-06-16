package top.cyixlq.example.model.bean

import com.google.gson.annotations.SerializedName

data class JokeVideo(
    val comment: String,
    val down: String,
    val forward: String,
    val header: String,
    val images: Any,
    val name: String,
    @SerializedName("passtime")
    val passTime: String,
    val sid: String,
    val text: String,
    val thumbnail: String,
    @SerializedName("top_comments_content")
    val topCommentsContent: String,
    @SerializedName("top_comments_header")
    val topCommentsHeader: String,
    @SerializedName("top_comments_name")
    val topCommentsName: String,
    @SerializedName("top_comments_uid")
    val topCommentsUid: String,
    @SerializedName("top_comments_voiceuri")
    val topCommentsVoiceUri: String,
    val type: String,
    val uid: String,
    val up: String,
    val video: String
)