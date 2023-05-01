
package eus.birt.dam.domain;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

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
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("documentname")
public String getDocumentname() {
return documentname;
}

@JsonProperty("documentname")
public void setDocumentname(String documentname) {
this.documentname = documentname;
}

@JsonProperty("eventtype")
public String getEventtype() {
return eventtype;
}

@JsonProperty("eventtype")
public void setEventtype(String eventtype) {
this.eventtype = eventtype;
}

@JsonProperty("eventstartdate")
public String getEventstartdate() {
return eventstartdate;
}

@JsonProperty("eventstartdate")
public void setEventstartdate(String eventstartdate) {
this.eventstartdate = eventstartdate;
}

@JsonProperty("eventenddate")
public String getEventenddate() {
return eventenddate;
}

@JsonProperty("eventenddate")
public void setEventenddate(String eventenddate) {
this.eventenddate = eventenddate;
}

@JsonProperty("eventcountryname")
public String getEventcountryname() {
return eventcountryname;
}

@JsonProperty("eventcountryname")
public void setEventcountryname(String eventcountryname) {
this.eventcountryname = eventcountryname;
}

@JsonProperty("eventterritoryname")
public String getEventterritoryname() {
return eventterritoryname;
}

@JsonProperty("eventterritoryname")
public void setEventterritoryname(String eventterritoryname) {
this.eventterritoryname = eventterritoryname;
}

@JsonProperty("eventtownname")
public String getEventtownname() {
return eventtownname;
}

@JsonProperty("eventtownname")
public void setEventtownname(String eventtownname) {
this.eventtownname = eventtownname;
}

@JsonProperty("eventwhere")
public String getEventwhere() {
return eventwhere;
}

@JsonProperty("eventwhere")
public void setEventwhere(String eventwhere) {
this.eventwhere = eventwhere;
}

@JsonProperty("eventregistrationstartdate")
public String getEventregistrationstartdate() {
return eventregistrationstartdate;
}

@JsonProperty("eventregistrationstartdate")
public void setEventregistrationstartdate(String eventregistrationstartdate) {
this.eventregistrationstartdate = eventregistrationstartdate;
}

@JsonProperty("eventregistrationenddate")
public String getEventregistrationenddate() {
return eventregistrationenddate;
}

@JsonProperty("eventregistrationenddate")
public void setEventregistrationenddate(String eventregistrationenddate) {
this.eventregistrationenddate = eventregistrationenddate;
}

@JsonProperty("eventonline")
public String getEventonline() {
return eventonline;
}

@JsonProperty("eventonline")
public void setEventonline(String eventonline) {
this.eventonline = eventonline;
}

@JsonProperty("eventprice")
public String getEventprice() {
return eventprice;
}

@JsonProperty("eventprice")
public void setEventprice(String eventprice) {
this.eventprice = eventprice;
}

@JsonProperty("eventlanguages")
public String getEventlanguages() {
return eventlanguages;
}

@JsonProperty("eventlanguages")
public void setEventlanguages(String eventlanguages) {
this.eventlanguages = eventlanguages;
}

@JsonProperty("eventimageurl")
public String getEventimageurl() {
return eventimageurl;
}

@JsonProperty("eventimageurl")
public void setEventimageurl(String eventimageurl) {
this.eventimageurl = eventimageurl;
}

@JsonProperty("eventsourceurl")
public String getEventsourceurl() {
return eventsourceurl;
}

@JsonProperty("eventsourceurl")
public void setEventsourceurl(String eventsourceurl) {
this.eventsourceurl = eventsourceurl;
}

@JsonProperty("placename")
public String getPlacename() {
return placename;
}

@JsonProperty("placename")
public void setPlacename(String placename) {
this.placename = placename;
}

@JsonProperty("address")
public String getAddress() {
return address;
}

@JsonProperty("address")
public void setAddress(String address) {
this.address = address;
}

@JsonProperty("municipality")
public String getMunicipality() {
return municipality;
}

@JsonProperty("municipality")
public void setMunicipality(String municipality) {
this.municipality = municipality;
}

@JsonProperty("municipalitycode")
public String getMunicipalitycode() {
return municipalitycode;
}

@JsonProperty("municipalitycode")
public void setMunicipalitycode(String municipalitycode) {
this.municipalitycode = municipalitycode;
}

@JsonProperty("territory")
public String getTerritory() {
return territory;
}

@JsonProperty("territory")
public void setTerritory(String territory) {
this.territory = territory;
}

@JsonProperty("territorycode")
public String getTerritorycode() {
return territorycode;
}

@JsonProperty("territorycode")
public void setTerritorycode(String territorycode) {
this.territorycode = territorycode;
}

@JsonProperty("country")
public String getCountry() {
return country;
}

@JsonProperty("country")
public void setCountry(String country) {
this.country = country;
}

@JsonProperty("countrycode")
public String getCountrycode() {
return countrycode;
}

@JsonProperty("countrycode")
public void setCountrycode(String countrycode) {
this.countrycode = countrycode;
}

@JsonProperty("friendlyurl")
public String getFriendlyurl() {
return friendlyurl;
}

@JsonProperty("friendlyurl")
public void setFriendlyurl(String friendlyurl) {
this.friendlyurl = friendlyurl;
}

@JsonProperty("physicalurl")
public String getPhysicalurl() {
return physicalurl;
}

@JsonProperty("physicalurl")
public void setPhysicalurl(String physicalurl) {
this.physicalurl = physicalurl;
}

@JsonProperty("dataxml")
public String getDataxml() {
return dataxml;
}

@JsonProperty("dataxml")
public void setDataxml(String dataxml) {
this.dataxml = dataxml;
}

@JsonProperty("metadataxml")
public String getMetadataxml() {
return metadataxml;
}

@JsonProperty("metadataxml")
public void setMetadataxml(String metadataxml) {
this.metadataxml = metadataxml;
}

@JsonProperty("zipfile")
public String getZipfile() {
return zipfile;
}

@JsonProperty("zipfile")
public void setZipfile(String zipfile) {
this.zipfile = zipfile;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}