package mutlitap.media.adaptor.out.mysql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mutlitap.media.common.response.BaseEntity;
import mutlitap.media.domain.model.MediaKind;
import mutlitap.media.domain.model.MediaType;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Getter
@Entity
@NoArgsConstructor
@SQLDelete(sql = "UPDATE product SET is_deleted = true WHERE id = ?")
@Where(clause = "is_deleted = false") // 항상 삭제되지 않은 데이터만 조회
public class MediaEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private Boolean thumbChecked;
    private MediaType mediaType;
    private MediaKind mediaKind;
    private Integer mediaSeq;
    private Boolean isDeleted; // Soft delete 필드

    @Builder
    public MediaEntity(
            String url,
            Boolean thumbChecked,
            MediaType mediaType,
            MediaKind mediaKind,
            Integer mediaSeq) {
        this.url = url;
        this.thumbChecked = thumbChecked;
        this.mediaType = mediaType;
        this.mediaKind = mediaKind;
        this.mediaSeq = mediaSeq;
        this.isDeleted = false;
    }
}