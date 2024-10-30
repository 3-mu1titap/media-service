package mutlitap.media.application.port.out.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mutlitap.media.domain.model.MediaKind;
import mutlitap.media.domain.model.MediaType;

@Getter
@NoArgsConstructor
public class MediaAddTransactionDto {

    private String url;
    private Boolean thumbChecked;
    private MediaType mediaType;
    private MediaKind mediaKind;
    private Integer mediaSeq;
    private Boolean isDeleted;

    @Builder
    public MediaAddTransactionDto(
            String url,
            Boolean thumbChecked,
            MediaType mediaType,
            MediaKind mediaKind,
            Integer mediaSeq,
            Boolean isDeleted) {
        this.url = url;
        this.thumbChecked = thumbChecked;
        this.mediaType = mediaType;
        this.mediaKind = mediaKind;
        this.mediaSeq = mediaSeq;
        this.isDeleted = isDeleted;
    }



}