package constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApiResponseCode {
    SUCCESS("200", "SUCCESS"),
    ENTITY_NOT_FOUND("404", "ENTITY_NOT_FOUND"),
    SEAT_TYPE_NOT_FOUND("404", "SEAT_TYPE_NOT_FOUND"),
    EMAIL_NOT_FOUND("404", "EMAIL_NOT_FOUND"),
    EMAIL_EXISTED("409", "EMAIL_EXISTED"),
    BAD_CREDENTIALS("401", "BAD_CREDENTIALS"),
    INVALID_HTTP_REQUEST("400", "INVALID_HTTP_REQUEST"),
    INVALID_TYPE("403", "INVALID_TYPE"),
    INVALID_TOKEN("400", "INVALID_TOKEN"),
    INVALID_SEAT_MAP("400", "INVALID_SEAT_MAP"),
    INVALID_START_TIME("400", "INVALID_START_TIME"),
    MOVIE_NOT_PUBLISHED("400", "MOVIE_NOT_PUBLISHED"),
    SCREEN_OCCUPIED("400", "SCREEN_OCCUPIED"),
    BAD_REQUEST("400", "BAD_REQUEST"),
    RESET_KEY_NOT_FOUND("404", "RESET_KEY_NOT_FOUND"),
    INITIATED_SEAT_MAP("400", "SeatMap of this screen has already been initiated"),
    BUSY_SCREEN("400", "Cannot update SeatMap: Screen is going to be used"),;
    private final String status;
    private final String description;
}
