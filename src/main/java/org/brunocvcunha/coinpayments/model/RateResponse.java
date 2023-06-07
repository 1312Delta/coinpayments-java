/**
 * Copyright (C) 2018 Bruno Candido Volpato da Cunha (brunocvcunha@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.brunocvcunha.coinpayments.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Search Result
 * 
 * @author Bruno Candido Volpato da Cunha
 *
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RateResponse {
    private String name;
    
    @JsonProperty("is_fiat")
    private int fiat;
    
    @JsonProperty("rate_btc")
    private String rateBtc;
    
    @JsonProperty("last_update")
    private long lastUpdate;
    
    private int confirms;
    
    @JsonProperty("tx_fee")
    private double txFee;

    @JsonProperty("status")
    private String status;

    @JsonProperty("image")
    private String image;

    @JsonProperty("accepted")
    private int accepted;



    private List<String> capabilities;

}