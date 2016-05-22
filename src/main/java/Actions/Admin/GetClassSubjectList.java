package Actions.Admin;

import Entities.Subject;
import Entities.Class;
import Services.Interfacies.IScheduleService;
import Services.ServiceException;
import Services.ServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by Артем on 22.05.2016.
 */
public class GetClassSubjectList extends ActionSupport {
    public List<Subject> subjectList;
    public Class cls;
    private IScheduleService scheduleService = ServiceFactory.getScheduleService();

    public String execute() throws Exception {
        try {
            subjectList = scheduleService.GetSubjectListForClass(cls);
            return SUCCESS;

        } catch (ServiceException ex) {
            return ERROR;
        } catch (Exception ex) {
            return ERROR;
        }
    }

    public void setSubjectList(List<Subject> clsList) {
        this.subjectList = subjectList;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }


    public Class getCls() {
        return cls;
    }

    public void setCls(Class cls) {
        this.cls = cls;
    }
}