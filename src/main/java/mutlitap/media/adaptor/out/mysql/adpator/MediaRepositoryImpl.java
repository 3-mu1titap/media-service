package mutlitap.media.adaptor.out.mysql.adpator;

import lombok.RequiredArgsConstructor;
import mutlitap.media.adaptor.out.mysql.mapper.MediaEntityMapper;
import mutlitap.media.adaptor.out.mysql.repository.MediaJpaRepository;
import mutlitap.media.application.port.out.MediaRepositoryPort;
import mutlitap.media.application.port.out.dto.MediaAddTransactionDto;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MediaRepositoryImpl implements MediaRepositoryPort {

    private final MediaJpaRepository mediaJpaRepository;
    private final MediaEntityMapper mediaEntityMapper;

    @Override
    public void saveMedia(MediaAddTransactionDto mediaAddTransactionDto) {
        mediaJpaRepository.save(mediaEntityMapper.toEntity(mediaAddTransactionDto));
    }

}