package taehyeon.com.blog.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import taehyeon.com.blog.entity.Comment;
import taehyeon.com.blog.repository.CommentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    public Comment findById(Long id) {
        return commentRepository.findById(id).orElse(null);
    }

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    public Comment create(Comment comment) {
        return commentRepository.save(comment);
    }

    public Comment update(Long id, Comment comment) {
        Comment newComment = findById(id);
        newComment.Builder(newComment.getId(), comment.getPostId(), comment.getUserId(), comment.getContent());
        return commentRepository.save(newComment);
    }

    public void deleteById(Long id) {
        commentRepository.deleteById(id);
    }

}