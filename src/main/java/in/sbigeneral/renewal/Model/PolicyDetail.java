package in.sbigeneral.renewal.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PolicyDetail {
    private int id;
    private String policyNo;
    private String ebaoCreationDate;
    private String bancsCreationDate;
}
