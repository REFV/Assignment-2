package comm.example.service;

import comm.example.model.OfficeTask;
import comm.example.model.SocialTask;

import java.util.Optional;

public interface SocialTaskService {
    public Iterable<SocialTask> findAllSocialTasks();
    public Optional<SocialTask> findSocialTaskById(int Id);
    public SocialTask createAndUpdateSocialTask(SocialTask socialTask);
    public void deleteSocialTask(SocialTask socialTask);
    public void deleteSocialTaskById(int Id);
}


