package mutlitap.media.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import mutlitap.media.application.port.in.dto.MediaAddRequestDto;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class MediaDomain {

    private Long id;
    private String url;
    private Boolean thumbChecked;
    private MediaType mediaType;
    private MediaKind mediaKind;
    private Integer mediaSeq;

    private Boolean isDeleted;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Builder
    public MediaDomain(
            String url,
            Boolean thumbChecked,
            MediaType mediaType,
            MediaKind mediaKind,
            Integer mediaSeq,
            Boolean isDeleted,
            LocalDateTime createdAt,
            LocalDateTime updatedAt) {
        this.url = url;
        this.thumbChecked = thumbChecked;
        this.mediaType = mediaType;
        this.mediaKind = mediaKind;
        this.mediaSeq = mediaSeq;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public static MediaDomain toDomain(MediaAddRequestDto mediaAddRequestDto) {
        return MediaDomain.builder()
                .url(mediaAddRequestDto.getUrl())
                .thumbChecked(false)
                .mediaType(mediaAddRequestDto.getMediaType())
                .mediaKind(mediaAddRequestDto.getMediaKind())
                .mediaSeq(mediaAddRequestDto.getMediaSeq())
                .isDeleted(false)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
    }

}