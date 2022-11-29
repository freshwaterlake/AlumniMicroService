package com.univariety.alumni.domain.aggregate;

import com.univariety.alumni.core.AbstractAggregateRootEntity;
import com.univariety.alumni.domain.subdomain.preference.Skill;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "user")
public class Preferences extends AbstractAggregateRootEntity {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "preferences")
    private Set<Skill> skills;

    public Preferences setSkills(Set<Skill> skills) {
        for (Skill skill : skills) {
            this.addSkill(skill);
        }
        return this;
    }

    private void addSkill(Skill skill) {
        Boolean exists = false;
        for (Skill eSkill : this.skills) {
            if (eSkill.getId() != null && eSkill.getId() == skill.getId()) {
                exists = true;
                eSkill.setSkillCode(skill.getSkillCode());
                eSkill.setSkillLevelCode(skill.getSkillLevelCode());
                eSkill.setPreferences(this);
            }
        }

        if (!exists) {
            skill.setPreferences(this);
            this.skills.add(skill);
        }
    }
}
