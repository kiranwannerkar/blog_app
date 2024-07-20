package com.blogapp12.exception;

public class CommentNotFound extends  RuntimeException{

    public CommentNotFound(String msg){
        super(msg);
    }
}
