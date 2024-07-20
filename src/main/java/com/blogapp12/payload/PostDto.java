package com.blogapp12.payload;

import com.blogapp12.entity.Post;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto  {

   private long id;
   @NotEmpty
   @Size(min = 3 , message = "Title should be atleast 3 characters")
    private String title;
   @NotEmpty
   @Size(min = 3)
    private String description;
    private String content;
}
