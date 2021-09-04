package pyk.cko.constants

import pyk.cko.model.FeedComment
import pyk.cko.model.FeedItem
import pyk.cko.model.FeedText

class StaticValues {
    companion object {
        const val TYPE_TEXT: Int = 0
        const val TYPE_PHOTO: Int = 1
        const val TYPE_VIDEO: Int = 2
        const val TYPE_TEXT_CLUB: Int = 10
        const val TYPE_PHOTO_CLUB: Int = 11
        const val TYPE_VIDEO_CLUB: Int = 12

        val items: MutableList<FeedItem> = initItems()
        val comments: MutableList<FeedComment> = initComments()

        private fun initItems(): MutableList<FeedItem> {
            val list: MutableList<FeedItem> = mutableListOf()
            list.add(FeedText(0, 0, 0, "OMG I JUST HAD SO MUCH FUN AT THE BEACH LOL XDDDD"))
            list.add(
                FeedText(
                    1, 0, 0,
                    "LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN"
                )
            )
            list.add(
                FeedText(
                    2, 0, 0,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque venenatis rhoncus porttitor. Vestibulum auctor nibh in lorem blandit tempor. Aliquam neque libero, tempus et ipsum ut, aliquam lacinia risus. Nulla euismod turpis magna, ut congue metus molestie vitae. Aliquam erat volutpat. Integer sed imperdiet nunc, quis cursus elit. Mauris metus tellus, semper ac ante in, semper commodo risus.\n" +
                            "\n" +
                            "Vivamus venenatis, arcu at pulvinar consequat, ipsum magna rhoncus ex, eu volutpat urna odio rhoncus metus. Praesent velit nunc, venenatis eu facilisis eu, dignissim sit amet mauris. Interdum et malesuada fames ac ante ipsum primis in faucibus. Pellentesque efficitur ac nulla ac sollicitudin. Integer nec massa felis. Aenean dolor justo, vehicula quis hendrerit in, congue et ante. Phasellus egestas augue porta viverra fringilla. Fusce a ante eget massa finibus cursus eu et quam. Quisque sed nibh tortor. Phasellus rutrum, urna in finibus dictum, diam tellus consequat neque, sit amet hendrerit risus massa ut nibh. Ut ac quam finibus, pretium nunc in, elementum arcu.\n" +
                            "\n" +
                            "Donec finibus mattis nisl at porttitor. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Ut sed tincidunt ipsum. Aliquam suscipit dictum mattis. Praesent magna nisl, dapibus ac vulputate vitae, auctor ac leo. Aenean fermentum accumsan convallis. Etiam sodales posuere ornare. Donec mattis turpis sed erat laoreet gravida.\n" +
                            "\n" +
                            "Donec id justo est. Nullam at mi vel ligula vestibulum lacinia. Nulla tristique euismod turpis ac laoreet. Praesent a lectus eget neque tincidunt dignissim eget vel augue. Cras ultricies purus in nisi hendrerit hendrerit. Cras et fringilla felis, a laoreet arcu. Etiam quis lacus posuere, consequat nisi sed, auctor dolor. Aliquam in ullamcorper tellus. Aenean elementum lobortis nunc, vel luctus tortor suscipit id. Nam accumsan erat purus, in semper augue fringilla elementum. Praesent id fringilla velit, at pharetra elit.\n" +
                            "\n" +
                            "Vestibulum aliquam a risus sit amet rutrum. Vestibulum ex orci, porta vel mattis eget, pharetra vitae ipsum. Sed rhoncus aliquet ligula efficitur cursus. Vivamus malesuada ullamcorper velit, in egestas ante egestas eu. Donec venenatis rhoncus augue consectetur egestas. Mauris eget placerat est. In id vehicula ante. Nunc tellus ligula, eleifend id justo sed, rutrum sodales felis. Quisque vel mauris dapibus, laoreet diam eu, venenatis massa. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas non viverra libero. Duis suscipit vel eros eu scelerisque. Vivamus in posuere libero. Curabitur dolor orci, interdum vitae sagittis vitae, dictum sed sapien. Morbi id elementum nisl. Nullam tempus mattis tortor, vitae semper quam mattis quis.\n" +
                            "\n" +
                            "Ut cursus volutpat suscipit. Ut orci ante, luctus posuere tincidunt id, mattis id dolor. Praesent a lacinia mi, ultrices rutrum ligula. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nunc id magna vitae mi dapibus pretium. Nam varius ac purus quis tincidunt. Cras lacus nisl, gravida eget efficitur sit amet, tincidunt nec dui. Suspendisse ullamcorper lorem vel enim consequat sollicitudin. Vestibulum a nunc mauris. Nullam vitae dictum augue, eu dapibus tellus. Nulla aliquet mollis efficitur. Aenean tempor, ligula at hendrerit ullamcorper, ipsum ante egestas est, id vestibulum magna augue a velit. Maecenas ullamcorper quam non risus finibus porta. Nunc finibus id eros et dictum. Donec mauris massa, elementum vel luctus et, interdum a nibh.\n" +
                            "\n" +
                            "Morbi vel elementum libero. Ut vel felis ante. Nulla facilisi. Vestibulum pellentesque porttitor varius. Ut quis porttitor tortor, vel sagittis mi. Donec lobortis, dolor in molestie mattis, lacus nulla imperdiet sapien, id maximus lacus eros et purus. Sed augue enim, viverra vulputate ipsum vitae, luctus ultricies nisi. Nullam aliquet congue lorem, in lobortis leo tempor ut. Integer lacus ante, dapibus sit amet magna a, aliquam sollicitudin diam. Pellentesque nibh felis, egestas ultricies eros at, varius bibendum mi. Praesent in aliquam mi.\n" +
                            "\n" +
                            "Sed ornare commodo eleifend. Curabitur at nunc felis. Vestibulum ut facilisis leo. Sed mattis lectus nec nisl pharetra, ac consectetur lorem suscipit. Donec varius arcu ut accumsan ornare. Proin ornare orci id sodales luctus. Sed sed tempus justo, ut egestas purus.\n" +
                            "\n" +
                            "Sed nibh mauris, imperdiet a dui at, auctor finibus quam. Donec elit quam, varius laoreet posuere sed, vestibulum vitae sapien. Vivamus vehicula ex sit amet mauris hendrerit rhoncus. Suspendisse et tincidunt dolor, ac aliquet nunc. Integer ut tempor mi. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Aliquam ut sodales nunc. Aenean pulvinar magna in porta tempus. Nullam laoreet dictum dolor. Duis quis enim vel felis suscipit molestie elementum ut felis. Nam pharetra, sem nec commodo hendrerit, metus augue luctus mi, ut elementum sem massa vel purus. Cras dignissim tellus sit amet egestas sagittis. Morbi felis neque, sagittis sit amet lacus non, tincidunt volutpat sapien.\n" +
                            "\n" +
                            "Quisque rutrum ornare ex, non maximus tortor varius non. Curabitur erat mi, lacinia a elementum eu, venenatis et ex. Quisque vehicula arcu magna, sed facilisis justo dignissim a. Etiam ultrices lacus odio, at consequat libero vehicula a. Nam maximus eleifend mattis. Sed nec sem laoreet, varius velit vestibulum, molestie tellus. Suspendisse potenti. Fusce nibh mi, viverra quis commodo nec, dapibus sit amet erat. Fusce accumsan at ante in euismod."
                )
            )
            list.add(
                FeedText(
                    2, 0, 10,
                    "I would like to discuss that which is known as having a good time at the beach. I postulate that perhaps other than fun what may have been acquired as well is cultural enrichment and the property of having sand in ones shoe. Such a feeling can only be described in metaphysical properties including but not exclusive to feeling like Anakin Skywalker when  he discusses his distaste for sand."
                )
            )
            list.add(FeedText(3, 0, 0, "777"))
            list.add(
                FeedText(
                    2, 0, 0,
                    "I would like to discuss that which is known as having a good time at the beach. I postulate that perhaps other than fun what may have been acquired as well is cultural enrichment and the property of having sand in ones shoe. "
                )
            )

            list.add(FeedText(0, 1, 0, "OMG I JUST HAD SO MUCH FUN AT THE BEACH LOL XDDDD"))
            list.add(
                FeedText(
                    1, 1, 10,
                    "LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN"
                )
            )
            list.add(
                FeedText(
                    2, 1, 0,
                    "I would like to discuss that which is known as having a good time at the beach. I postulate that perhaps other than fun what may have been acquired as well is cultural enrichment and the property of having sand in ones shoe. Such a feeling can only be described in metaphysical properties including but not exclusive to feeling like Anakin Skywalker when  he discusses his distaste for sand."
                )
            )
            list.add(FeedText(3, 1, 0, null))
            list.add(
                FeedText(
                    2, 1, 0,
                    "I would like to discuss that which is known as having a good time at the beach. I postulate that perhaps other than fun what may have been acquired as well is cultural enrichment and the property of having sand in ones shoe. "
                )
            )

            list.add(FeedText(0, 2, 10, "OMG I JUST HAD SO MUCH FUN AT THE BEACH LOL XDDDD"))
            list.add(
                FeedText(
                    1, 2, 0,
                    "LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN LOL RIGHT? BEACH SO FUN"
                )
            )
            list.add(
                FeedText(
                    2, 2, 0,
                    "I would like to discuss that which is known as having a good time at the beach. I postulate that perhaps other than fun what may have been acquired as well is cultural enrichment and the property of having sand in ones shoe. Such a feeling can only be described in metaphysical properties including but not exclusive to feeling like Anakin Skywalker when  he discusses his distaste for sand."
                )
            )
            list.add(FeedText(3, 2, 0, ""))
            list.add(
                FeedText(
                    2, 2, 0,
                    "I would like to discuss that which is known as having a good time at the beach. I postulate that perhaps other than fun what may have been acquired as well is cultural enrichment and the property of having sand in ones shoe. "
                )
            )

            return list
        }

        private fun initComments(): MutableList<FeedComment> {
            val list: MutableList<FeedComment> = mutableListOf()

            list.add(FeedComment(0, 0, 0, "Did you have fun at the beach?"))
            list.add(FeedComment(1, 0, 0, "I really enjoy laguna beach"))
            list.add(FeedComment(2, 0, 0, "why wasn't i invite to go to the beach with you? how long have i been your friend how could you do this to me you were the chosen one anakin you were supposed to defeat the beach not become the beach"))
            list.add(FeedComment(3, 0, 0, "shut up dad i have the high ground"))
            list.add(FeedComment(4, 0, 0, "EXCUSE ME???!?!?!?!!11111 DO YOU EVEN KNOW WHO I AM?"))
            list.add(FeedComment(5, 0, 0, "What the uwu did you just uwuing say about me, you little uwu? I'll have you know I graduated top of my class in the Navy Seals, and I've been involved in numerous secret raids on Al-Quaeda, and I have over 300 confirmed kills. I am trained in gorilla warfare and I'm the top sniper in the entire US armed forces. You are nothing to me but just another target. I will wipe you the uwu out with precision the likes of which has never been seen before on this Earth, mark my uwu words. You think you can get away with saying that uwu to me over the Internet? Think again, uwuer. As we speak I am contacting my secret network of spies across the USA and your IP is being traced right now so you better prepare for the storm, maggot. The storm that wipes out the pathetic little thing you call your life. You're uwuing dead, kid. I can be anywhere, anytime, and I can kill you in over seven hundred ways, and that's just with my bare hands. Not only am I extensively trained in unarmed combat, but I have access to the entire arsenal of the United States Marine Corps and I will use it to its full extent to wipe your miserable uwu off the face of the continent, you little uwu. If only you could have known what unholy retribution your little \"clever\" comment was about to bring down upon you, maybe you would have held your uwuing tongue. But you couldn't, you didn't, and now you're paying the price, you uwu idiot. I will uwu fury all over you and you will drown in it. You're uwuing dead, kiddo."))
            list.add(FeedComment(6, 0, 0, "like, that's just your opinion man. u know what i mean? cuz like its not facts or w/e its just u sayin stuff. which like would be an opinion right? so like if its your opinion, then that would mean its your opinion right? so like, its your opinion. and if its your opinion i just wanna know like.... who asked?"))
            list.add(FeedComment(7, 0, 0, "Did you have fun at the beach?"))
            list.add(FeedComment(8, 0, 0, "I really enjoy laguna beach"))
            list.add(FeedComment(9, 0, 0, "why wasn't i invite to go to the beach with you? how long have i been your friend how could you do this to me you were the chosen one anakin you were supposed to defeat the beach not become the beach"))
            list.add(FeedComment(10, 0, 0, "shut up dad i have the high ground"))
            list.add(FeedComment(11, 0, 0, "EXCUSE ME???!?!?!?!!11111 DO YOU EVEN KNOW WHO I AM?"))
            list.add(FeedComment(12, 0, 0, "What the uwu did you just uwuing say about me, you little uwu? I'll have you know I graduated top of my class in the Navy Seals, and I've been involved in numerous secret raids on Al-Quaeda, and I have over 300 confirmed kills. I am trained in gorilla warfare and I'm the top sniper in the entire US armed forces. You are nothing to me but just another target. I will wipe you the uwu out with precision the likes of which has never been seen before on this Earth, mark my uwu words. You think you can get away with saying that uwu to me over the Internet? Think again, uwuer. As we speak I am contacting my secret network of spies across the USA and your IP is being traced right now so you better prepare for the storm, maggot. The storm that wipes out the pathetic little thing you call your life. You're uwuing dead, kid. I can be anywhere, anytime, and I can kill you in over seven hundred ways, and that's just with my bare hands. Not only am I extensively trained in unarmed combat, but I have access to the entire arsenal of the United States Marine Corps and I will use it to its full extent to wipe your miserable uwu off the face of the continent, you little uwu. If only you could have known what unholy retribution your little \"clever\" comment was about to bring down upon you, maybe you would have held your uwuing tongue. But you couldn't, you didn't, and now you're paying the price, you uwu idiot. I will uwu fury all over you and you will drown in it. You're uwuing dead, kiddo."))
            list.add(FeedComment(13, 0, 0, "like, that's just your opinion man. u know what i mean? cuz like its not facts or w/e its just u sayin stuff. which like would be an opinion right? so like if its your opinion, then that would mean its your opinion right? so like, its your opinion. and if its your opinion i just wanna know like.... who asked?"))
            list.add(FeedComment(14, 0, 0, "Did you have fun at the beach?"))
            list.add(FeedComment(15, 0, 0, "I really enjoy laguna beach"))
            list.add(FeedComment(16, 0, 0, "why wasn't i invite to go to the beach with you? how long have i been your friend how could you do this to me you were the chosen one anakin you were supposed to defeat the beach not become the beach"))
            list.add(FeedComment(17, 0, 0, "shut up dad i have the high ground"))
            list.add(FeedComment(18, 0, 0, "EXCUSE ME???!?!?!?!!11111 DO YOU EVEN KNOW WHO I AM?"))
            list.add(FeedComment(19, 0, 0, "What the uwu did you just uwuing say about me, you little uwu? I'll have you know I graduated top of my class in the Navy Seals, and I've been involved in numerous secret raids on Al-Quaeda, and I have over 300 confirmed kills. I am trained in gorilla warfare and I'm the top sniper in the entire US armed forces. You are nothing to me but just another target. I will wipe you the uwu out with precision the likes of which has never been seen before on this Earth, mark my uwu words. You think you can get away with saying that uwu to me over the Internet? Think again, uwuer. As we speak I am contacting my secret network of spies across the USA and your IP is being traced right now so you better prepare for the storm, maggot. The storm that wipes out the pathetic little thing you call your life. You're uwuing dead, kid. I can be anywhere, anytime, and I can kill you in over seven hundred ways, and that's just with my bare hands. Not only am I extensively trained in unarmed combat, but I have access to the entire arsenal of the United States Marine Corps and I will use it to its full extent to wipe your miserable uwu off the face of the continent, you little uwu. If only you could have known what unholy retribution your little \"clever\" comment was about to bring down upon you, maybe you would have held your uwuing tongue. But you couldn't, you didn't, and now you're paying the price, you uwu idiot. I will uwu fury all over you and you will drown in it. You're uwuing dead, kiddo."))
            list.add(FeedComment(20, 0, 0, "like, that's just your opinion man. u know what i mean? cuz like its not facts or w/e its just u sayin stuff. which like would be an opinion right? so like if its your opinion, then that would mean its your opinion right? so like, its your opinion. and if its your opinion i just wanna know like.... who asked?"))

            return list
        }
    }
}