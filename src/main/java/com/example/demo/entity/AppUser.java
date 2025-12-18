@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

    private Boolean active;

    public AppUser() {
        this.active = true;
    }

    public AppUser(Long id, String email, String password,
                   Set<Role> roles, Boolean active) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.active = active;
    }
}
