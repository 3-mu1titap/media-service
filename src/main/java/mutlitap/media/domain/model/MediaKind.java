package mutlitap.media.domain.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MediaKind {

    REVIEW("리뷰"),
    MENTORING_INFO("멘토링 소개"),
    MENTORING_POST("멘토링 게시글"),
    PROFILE("프로필"),
    REPORT("신고");

    private final String mediaKind;

    @JsonValue
    public String getMediaKind() {
        return mediaKind;
    }

    @JsonCreator
    public static MediaKind fromString(String value) {
        for (MediaKind mediaKind: MediaKind.values()) {
            if (mediaKind.mediaKind.equals(value)) {
                return mediaKind;
            }
        }
        throw new IllegalArgumentException("UnKnown value: " + value);
    }

}
