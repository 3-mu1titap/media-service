package mutlitap.media.adaptor.in.mapper;

import mutlitap.media.adaptor.in.rest.vo.MediaRequestVo;
import mutlitap.media.application.port.in.dto.MediaAddRequestDto;
import org.springframework.stereotype.Component;

@Component
public class MediaVoMapper {

    public MediaAddRequestDto toDto(MediaRequestVo requestVo) {
        return MediaAddRequestDto.builder()
                .url(requestVo.getUrl())
                .thumbChecked(requestVo.getThumbChecked())
                .mediaType(requestVo.getMediaType())
                .mediaKind(requestVo.getMediaKind())
                .mediaSeq(requestVo.getMediaSeq())
                .build();
    }

}