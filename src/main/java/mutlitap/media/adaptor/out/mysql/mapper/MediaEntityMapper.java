package mutlitap.media.adaptor.out.mysql.mapper;

import mutlitap.media.adaptor.out.mysql.entity.MediaEntity;
import mutlitap.media.application.port.out.dto.MediaAddTransactionDto;
import org.springframework.stereotype.Component;

@Component
public class MediaEntityMapper {

    public MediaEntity toEntity(MediaAddTransactionDto mediaAddTransactionDto) {
        return MediaEntity.builder()
                .url(mediaAddTransactionDto.getUrl())
                .thumbChecked(mediaAddTransactionDto.getThumbChecked())
                .mediaType(mediaAddTransactionDto.getMediaType())
                .mediaKind(mediaAddTransactionDto.getMediaKind())
                .mediaSeq(mediaAddTransactionDto.getMediaSeq())
                .build();

    }
}