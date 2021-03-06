package Actions.Admin;

import ActionEntities.PupilUser;
import Entities.Pupil;
import Services.Interfacies.IAdminService;
import Services.Interfacies.IUserService;
import Services.ServiceException;
import Services.ServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by Артем on 08.05.2016.
 */
public class GetPupilList  extends ActionSupport {
    public List<PupilUser> pupilList;
    private IAdminService adminService = ServiceFactory.getAdminService();

    public String execute() throws Exception {
        try {
            pupilList = adminService.GetPupilList();
            return SUCCESS;

        } catch (ServiceException ex) {
            return ERROR;
        } catch (Exception ex) {
            return ERROR;
        }
    }

    public void setPupilList(List<PupilUser> pupilList) {
        this.pupilList = pupilList;
    }

    public List<PupilUser> getPupilList() {
        return pupilList;
    }
}
