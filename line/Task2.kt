//package line
//
//class CommentViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//    /**
//     * This function is called at RecyclerView.Adapter.onBindViewHolder()
//     */
//    fun bind(comment: Comment) {
//        // It should not be initialized here.
//        // every inflate will cause same value.
//        // We should be initialized at when adapter is created.
//
//        //itemView.likeButton.isSelected = comment.isLiked
//
//        itemView.likeButton.setOnClickListener {
//            // suppose we have viewmodel instance
//            // isSelected true means liked
//
//            if (itemView.likeButton.isSelected == comment.isLiked) {
//                itemView.likeButton.isSelected = comment.isDisliked
//            } else
//                itemView.likeButton.isSelected = comment.isLiked
//
//            vm.requestLikeUnlikeApi( itemView.likeButton.isSelected)
//        }
//
//
//    }
//}
//
//class CommentViewModel : ViewModel () {
//    fun requestLikeUnlikeApi(isLiked : Boolean) {
//        // TODO write request
//    }
//}