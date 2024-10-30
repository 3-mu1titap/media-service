package mutlitap.media.application.mapper;

import mutlitap.media.application.port.out.dto.MediaAddTransactionDto;
import mutlitap.media.domain.model.MediaDomain;
import org.springframework.stereotype.Component;

@Component
public class MediaDtoMapper {

    public MediaAddTransactionDto toTransactionDto(MediaDomain mediaDomain) {
        return MediaAddTransactionDto.builder()
                .url(mediaDomain.getUrl())
                .thumbChecked(mediaDomain.getThumbChecked())
                .mediaType(mediaDomain.getMediaType())
                .mediaKind(mediaDomain.getMediaKind())
                .mediaSeq(mediaDomain.getMediaSeq())
                .isDeleted(mediaDomain.getIsDeleted())
                .build();
    }

}