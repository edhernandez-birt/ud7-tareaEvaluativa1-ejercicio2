package eus.birt.dam.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"documentname",
"eventtype",
"eventstartdate",
"eventenddate",
"eventcountryname",
"eventterritoryname",
"eventtownname",
"eventwhere",
"eventregistrationstartdate",
"eventregistrationenddate",
"eventonline",
"eventprice",
"eventlanguages",
"eventimageurl",
"eventsourceurl",
"placename",
"address",
"municipality",
"municipalitycode",
"territory",
"territorycode",
"country",
"countrycode",
"friendlyurl",
"physicalurl",
"dataxml",
"metadataxml",
"zipfile"
})
@Data
@NoArgsConstructor
@Generated("jsonschema2pojo")
public class Properties {

@JsonProperty("documentname")
private String documentname;
@JsonProperty("eventtype")
private String eventtype;
@JsonProperty("eventstartdate")
private String eventstartdate;
@JsonProperty("eventenddate")
private String eventenddate;
@JsonProperty("eventcountryname")
private String eventcountryname;
@JsonProperty("eventterritoryname")
private String eventterritoryname;
@JsonProperty("eventtownname")
private String eventtownname;
@JsonProperty("eventwhere")
private String eventwhere;
@JsonProperty("eventregistrationstartdate")
private String eventregistrationstartdate;
@JsonProperty("eventregistrationenddate")
private String eventregistrationenddate;
@JsonProperty("eventonline")
private String eventonline;
@JsonProperty("eventprice")
private String eventprice;
@JsonProperty("eventlanguages")
private String eventlanguages;
@JsonProperty("eventimageurl")
private String eventimageurl;
@JsonProperty("eventsourceurl")
private String eventsourceurl;
@JsonProperty("placename")
private String placename;
@JsonProperty("address")
private String address;
@JsonProperty("municipality")
private String municipality;
@JsonProperty("municipalitycode")
private String municipalitycode;
@JsonProperty("territory")
private String territory;
@JsonProperty("territorycode")
private String territorycode;
@JsonProperty("country")
private String country;
@JsonProperty("countrycode")
private String countrycode;
@JsonProperty("friendlyurl")
private String friendlyurl;
@JsonProperty("physicalurl")
private String physicalurl;
@JsonProperty("dataxml")
private String dataxml;
@JsonProperty("metadataxml")
private String metadataxml;
@JsonProperty("zipfile")
private String zipfile;

}