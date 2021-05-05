package cst438;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class MovieRating
{
   @Id
   @GeneratedValue
   private long id;
   
   @NotNull
   @Size(min=3, max=25)
   private String nameOfPoster;
   private String date;
   
   @NotNull
   @Size(min=3, max=25)
   private String title;
   
   @NotNull
   @Size(min=1, max=1)
   private String rating;
   
   public MovieRating()
   {
      this.date = new java.util.Date().toString();
   }
   
   public MovieRating(String nameOfPoster, String title, String date,
         String rating)
   {
      super();
      this.nameOfPoster = nameOfPoster;
      this.title = title;
      this.date = date;
      this.rating = rating;
   }
  
   public String getNameOfPoster()
   {
      return nameOfPoster;
   }
   
   public void setNameOfPoster(String nameOfPoster)
   {
      this.nameOfPoster = nameOfPoster;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public void setTitle(String title)
   {
      this.title = title;
   }
   
   public String getDate()
   {
      return date;
   }
   
   public void setDate(String date)
   {
      this.date = date;
   }
   
   public String getRating()
   {
      return rating;
   }
   
   public void setRating(String rating)
   {
      this.rating = rating;
   }
}
