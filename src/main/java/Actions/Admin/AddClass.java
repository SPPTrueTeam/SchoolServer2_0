package Actions.Admin;

import Entities.Class;
import Services.Interfacies.IAdminService;
import Services.Interfacies.IUserService;
import Services.ServiceException;
import Services.ServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Артем on 08.05.2016.
 */
public class AddClass extends ActionSupport {

    public Class cls = new Class();
    private IAdminService adminService = ServiceFactory.getAdminService();

    public String execute() throws Exception {
        try {
            if (cls.getGrade()!=0 && cls.getLetter()!=null) {
                adminService.AddClass(cls);
                return SUCCESS;
            }
            return ERROR;

        } catch (ServiceException ex) {
            return ERROR;
        }catch (Exception ex) {
            return ERROR;
        }
    }

    public void setClassGrade(int classGrade){
        this.cls.setGrade(classGrade);
    }

    public void setClassLetter(String classLetter){
        this.cls.setLetter(classLetter);
    }

    public void setCls(Class cls) {
        this.cls = cls;
    }

    public Class getCls(){
        return cls;
    }
}
