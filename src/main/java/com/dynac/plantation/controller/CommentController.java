// package com.dynac.plantation.controller;

// import com.dynac.plantation.model.Comment;
// import com.dynac.plantation.service.CommentService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;

// @RestController
// @RequestMapping("/api/comments")
// public class CommentController {
// @Autowired
// private CommentService commentService;

// @GetMapping("/post/{postId}")
// public ResponseEntity<List<Comment>> getCommentsByPostId(@PathVariable String
// postId) {
// return new ResponseEntity<>(commentService.getCommentsByPostId(postId),
// HttpStatus.OK);
// }

// @GetMapping("/{id}")
// public ResponseEntity<Comment> getCommentById(@PathVariable String id) {
// return new ResponseEntity<>(commentService.getCommentById(id),
// HttpStatus.OK);
// }

// @PostMapping
// public ResponseEntity<Comment> createComment(@RequestBody Comment comment) {
// return new ResponseEntity<>(commentService.createComment(comment),
// HttpStatus.CREATED);
// }

// @PutMapping("/{id}")
// public ResponseEntity<Comment> updateComment(@PathVariable String id,
// @RequestBody Comment comment) {
// return new ResponseEntity<>(commentService.updateComment(id, comment),
// HttpStatus.OK);
// }

// @DeleteMapping("/{id}")
// public ResponseEntity<Void> deleteComment(@PathVariable String id) {
// commentService.deleteComment(id);
// return new ResponseEntity<>(HttpStatus.NO_CONTENT);
// }
// }