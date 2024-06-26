package Users;

import Items.ResearchPaper;

public interface Researcher {
    ResearchPaper publishPaper();
    double calculateHIndex();
}
