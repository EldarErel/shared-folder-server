package com.project.sharedfolderserver.v1.file;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
public class FileDto {
    @JsonProperty("id")
    private UUID id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("dateModified")
    private LocalDateTime dateModified;
    @JsonProperty("dateAdded")
    private LocalDateTime dateAdded;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("size")
    private String size;
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private byte[] content;

    public FileDto(UUID id, String name, LocalDateTime dateModified, LocalDateTime dateAdded, String kind, String size)
    {
        this.id = id;
        this.name = name;
        this.dateModified = dateModified;
        this.dateAdded = dateAdded;
        this.kind = kind;
        this.size = size;
    }

    public UUID getId() {
        return id;
    }
}
