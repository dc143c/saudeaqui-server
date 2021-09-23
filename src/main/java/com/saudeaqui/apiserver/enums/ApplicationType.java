package com.saudeaqui.apiserver.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApplicationType {
    ENTERPRISE("Enterprise"),
    FULLTIME("Full Time"),
    PARTTIME("Part Time"),
    VOLUNTEER("Volunteer");

    private final String description;
}
