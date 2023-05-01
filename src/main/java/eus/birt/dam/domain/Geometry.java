
package eus.birt.dam.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "type", "coordinates" })

@Data
@NoArgsConstructor
@Generated("jsonschema2pojo")
public class Geometry {

	@JsonProperty("type")
	private String type;
	@JsonProperty("coordinates")
	private List<Double> coordinates;

}