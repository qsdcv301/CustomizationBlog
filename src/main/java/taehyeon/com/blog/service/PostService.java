package taehyeon.com.blog.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import taehyeon.com.blog.entity.Post;
import taehyeon.com.blog.repository.PostRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Post findById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Post create(Post post) {
        return postRepository.save(post);
    }

    public Post update(Long id, Post post) {
        Post newPost = findById(id);
        newPost.Builder(newPost.getId(), post.getBlogId(), post.getTitle(), post.getContent());
        return postRepository.save(newPost);
    }

    public void delete(Long id) {
        postRepository.deleteById(id);
    }

}