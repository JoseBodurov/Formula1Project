package bg.softuni.formula1attempt1.repositories;

import bg.softuni.formula1attempt1.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
}
