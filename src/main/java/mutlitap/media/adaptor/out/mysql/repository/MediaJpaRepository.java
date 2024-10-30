package mutlitap.media.adaptor.out.mysql.repository;

import mutlitap.media.adaptor.out.mysql.entity.MediaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaJpaRepository extends JpaRepository<MediaEntity, Long> {

}