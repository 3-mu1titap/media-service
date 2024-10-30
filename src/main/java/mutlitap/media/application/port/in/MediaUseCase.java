package mutlitap.media.application.port.in;

import mutlitap.media.application.port.in.dto.MediaAddRequestDto;

public interface MediaUseCase {

    void createMedia(MediaAddRequestDto mediaAddRequestDto);

    void getMedia(Long mediaId);

    void deleteMedia(Long mediaId);

}
