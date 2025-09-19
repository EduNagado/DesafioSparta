package com.DesafioSparta.Eduardo.Mapper;

import com.DesafioSparta.Eduardo.dto.TaxaRequest;
import com.DesafioSparta.Eduardo.dto.TaxaResponse;
import com.DesafioSparta.Eduardo.model.Taxa;

public class TaxaMapper {
    public Taxa requestTaxa (TaxaRequest taxaRequest){
        Taxa taxa = new Taxa();
        taxa.setPercentual(taxaRequest.percentual());

        return taxa;
    }

    public TaxaResponse responseTaxa (Taxa taxa){
        return new TaxaResponse(
                taxa.getPercentual()
        );
    }
}
