package mutlitap.media.application.port.out;

import mutlitap.media.application.port.in.dto.MediaAddRequestDto;
import mutlitap.media.application.port.out.dto.MediaAddTransactionDto;

public interface MediaRepositoryPort {

    void saveMedia(MediaAddTransactionDto mediaAddTransactionDto);

}