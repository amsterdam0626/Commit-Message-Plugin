package com.rmondjone.commit;

/**
 * From https://github.com/commitizen/conventional-commit-types
 *
 * @author Damien Arrachequesne
 */
public enum ChangeType {

    FEAT("新增功能", "新的功能点、新的需求"),
    FIX("Bug修复", "修复的Bug:现网发散Bug、测试阶段的Bug、验收阶段的Bug"),
    PERFECT("代码完善", "开发自测过程中遗漏的逻辑"),
    DOCS("文档修改", "只是修改了文档:注释、README.md等"),
    STYLE("样式修改", "不影响代码功能的修改:CSS样式、代码格式化等"),
    REFACTOR("代码重构", "代码更改既不修复错误也不添加功能"),
    PERF("性能优化", "代码更改可以提高性能"),
    TEST("测试代码", "添加缺失测试或更正现有测试"),
    BUILD("编译代码", "影响构建系统或外部依赖项的更改:build.gradle、package.json、Podfile等"),
    CI("持续集成", "我们的CI配置文件和脚本的更改:Jenkinsfile等"),
    REVERT("回退更改", "代码回退提交更改"),
    OTHER("其他提交", "除以上所有类型之外的提交更改");

    public final String title;
    public final String description;

    ChangeType(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.title, this.description);
    }
}
