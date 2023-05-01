
package eus.birt.dam.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "_id","id", "type", "geometry", "properties" })
@Data
@AllArgsConstructor
@Generated("jsonschema2pojo")
@Document(collection="kulturklik")

public class Evento {
	
	@JsonProperty("_id")
	private String id;
	@JsonProperty("id")
	private Integer eventoId;
	@JsonProperty("type")
	private String type;
	@JsonProperty("geometry")
	private Geometry geometry;
	@JsonProperty("properties")
	private Properties properties;

}