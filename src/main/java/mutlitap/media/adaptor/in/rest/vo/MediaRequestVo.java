package mutlitap.media.adaptor.in.rest.vo;

import lombok.Getter;
import mutlitap.media.domain.model.MediaKind;
import mutlitap.media.domain.model.MediaType;

@Getter
public class MediaRequestVo {

    private String url;
    private Boolean thumbChecked;
    private MediaType mediaType;
    private MediaKind mediaKind;
    private Integer mediaSeq;

}