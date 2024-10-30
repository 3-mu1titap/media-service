package mutlitap.media.application.service;

import lombok.RequiredArgsConstructor;
import mutlitap.media.application.mapper.MediaDtoMapper;
import mutlitap.media.application.port.in.dto.MediaAddRequestDto;
import mutlitap.media.application.port.in.MediaUseCase;
import mutlitap.media.application.port.out.MediaRepositoryPort;
import mutlitap.media.application.port.out.dto.MediaAddTransactionDto;
import mutlitap.media.domain.model.MediaDomain;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MediaService implements MediaUseCase {

    private final MediaRepositoryPort mediaRepositoryPort;
    private final MediaDtoMapper mediaDtoMapper;

    @Override
    public void createMedia(MediaAddRequestDto mediaAddRequestDto) {

        MediaDomain mediaDomain = MediaDomain.toDomain(mediaAddRequestDto);

        MediaAddTransactionDto transactionDto = mediaDtoMapper.toTransactionDto(mediaDomain);

        mediaRepositoryPort.saveMedia(transactionDto);
    }

    @Override
    public void getMedia(Long mediaId) {

    }

    @Override
    public void deleteMedia(Long mediaId) {

    }
}
