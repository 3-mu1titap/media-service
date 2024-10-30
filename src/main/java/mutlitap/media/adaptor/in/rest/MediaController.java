package mutlitap.media.adaptor.in.rest;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import mutlitap.media.adaptor.in.mapper.MediaVoMapper;
import mutlitap.media.adaptor.in.rest.vo.MediaRequestVo;
import mutlitap.media.adaptor.in.rest.vo.MediaResponseVo;
import mutlitap.media.application.port.in.MediaUseCase;
import mutlitap.media.common.response.BaseResponse;
import mutlitap.media.common.response.BaseResponseStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/media")
public class MediaController {

     /**
     * 미디어 서비스
     * 1. 미디어 추가
     * 2. 미디어 조회
     * 3. 미디어 삭제
     */

    private final MediaUseCase mediaUseCase;
    private final MediaVoMapper mediaVoMapper;

     /**
     * 미디어 추가
     *
     * @param requestVo 미디어 추가 요청
     * @return 미디어 추가 응답
     */
    @Operation(
            summary = "Media 생성",
            description = "url : 파일명, thumbChecked : 썸네일 여부, mediaType : 사진 or 동영상, mediaKind : 리뷰 or 멘토링 소개 or 멘토링 게시글 or 프로필 or 신고",
            tags = {"Media"})
    @PostMapping
    public BaseResponse<Void> createMedia(@RequestBody MediaRequestVo requestVo) {

        mediaUseCase.createMedia(mediaVoMapper.toDto(requestVo));

        return new BaseResponse<>(

        );
    }

     /**
     * 미디어 조회
     * @param mediaId 미디어 ID
     * @return 미디어 조회 응답
     */
    @Operation(summary = "Get Media API", description = "Get Media API 입니다.", tags = {"Media"})
    @GetMapping("/{mediaId}")
    public BaseResponse<MediaResponseVo> getMedia(@PathVariable Long mediaId, String reviewUUID) {
        return new BaseResponse<>(

        );
    }

     /**
     * 미디어 삭제
     * @param mediaId 미디어 ID
     * @return 미디어 삭제 응답
     */
    @Operation(summary = "Delete Media API", description = "Delete Media API 입니다.", tags = {"Media"})
    @DeleteMapping("/{mediaId}")
    public BaseResponse<Void> deleteMedia(@PathVariable Long mediaId) {
//        mediaUseCase.deleteMedia(mediaId);
        return new BaseResponse<>(
                BaseResponseStatus.SUCCESS
        );
    }

}