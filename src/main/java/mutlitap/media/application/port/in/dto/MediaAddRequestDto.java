package mutlitap.media.application.port.in.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mutlitap.media.domain.model.MediaKind;
import mutlitap.media.domain.model.MediaType;

@Getter
@NoArgsConstructor
public class MediaAddRequestDto {

    private String url;
    private Boolean thumbChecked;
    private MediaType mediaType;
    private MediaKind mediaKind;
    private Integer mediaSeq;

    @Builder
    public MediaAddRequestDto(
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
    }

}