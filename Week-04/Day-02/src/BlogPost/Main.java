package BlogPost;

public class Main{

public static void main(String[] args) {

        BlogPost entry1 = new BlogPost();
        entry1.title = "Lorem Ipsum";
        entry1.authorName = "John Doe";
        entry1.publicationDate = "2000.05.04.";
        entry1.text = "Lorem ipsum dolor sit amet.";

        BlogPost entry2 = new BlogPost();
        entry2.title = "Wait, but why";
        entry2.authorName = "Tim Urban";
        entry2.publicationDate = "2010.10.10.";
        entry2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

        BlogPost entry3 = new BlogPost();
        entry3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        entry3.authorName = "William Turton";
        entry3.publicationDate = "2017.03.28.";
        entry3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";

        Blog blog1 = new Blog();

        blog1.add(entry1);

        System.out.println(blog1);


        }
        }