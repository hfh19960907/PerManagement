package service.impl;

import dao.PostDao;
import domain.Post;
import org.springframework.stereotype.Service;
import service.PostService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("postService")
public class PostServiceImpl implements PostService {

    // 自动注入 DAO 对象
    @Resource
    private PostDao postDao;

    // 实现接口中的方法

    @Override
    public List<Post> findPosts(Map<String, Object> map) {

        return postDao.findPosts(map);
    }

    @Override
    public Integer getCount(Map<String, Object> map) {

        return postDao.getCount(map);
    }

    @Override
    public Integer addPost(Post post) {

        return postDao.addPost(post);
    }

    @Override
    public Integer updatePost(Post post) {

        return postDao.updatePost(post);
    }

    @Override
    public Integer deletePost(Integer id) {

        return postDao.deletePost(id);
    }

    @Override
    public Post getPostById(Integer id) {

        return postDao.getPostById(id);
    }

}
