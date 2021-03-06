package com.glookast.commons.settings.groups.media_processor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MediaProcessorGroup {

    @Builder.Default
    private Boolean fragmentedMP4Enabled = false;

    @NonNull
    @JsonProperty("MP4MuxerCompatibilityMode")
    private MP4MuxerCompatibilityMode mp4MuxerCompatibilityMode;

    @Builder.Default
    private Boolean userUMIDInMXForMP4OutputFilenameEnabled = false;

    @Builder.Default
    private Boolean aggregateAllMP4AudioChannelsEnabled = false;

    @Builder.Default
    private Integer refreshPeriodInSecondsForMOVGrowing = 0;

}
